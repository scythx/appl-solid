# appl-solid

### A. Stream Progress Info

Masalah yang dihadapi yaitu `StreamProgressInfo` hanya dapat bekerja dengan objek bertipe `File` padahal seharusnya `StreamProgressInfo` dapat bekerja dengan berbagai jenis `Stream`. Artinya `StreamProgressInfo` tidak menerapkan prinsip **Open Closed Principle**.

Karena `File` dan `Music` memiliki `bytesSent` yang memiliki fungsionalitas yang sama (yaitu informasi dari `Stream`), maka solusi untuk permasalahan ini yaitu dengan mengeneralisasikan hal yang berkaitan dengan `Stream` ke dalam bentuk interface `IStreamable`.

```Java
public interface IStreamable {
    Integer getLength();

    Integer getBytesSent();
}
```

Dengan demikian `StreamProgressInfo` dapat bekerja dengan objek yang mengimplementasikan interface `IStreamable`.

### B. Graphic Editor

Masalah yang dihadapi yaitu `drawShape` yang dimiliki oleh `GraphicEditor` harus mengetahui setiap concrete class yang mengimplementasikan `IShape`. Hal ini melanggar dua prinsip dari **SOLID**. Yang pertama yaitu **Single Responsibility Principle** karena setiap shape harus memiliki tanggung jawab masing-masing atas `drawShape`. Lalu yang kedua yaitu **Open Closed Principle** karena setiap jenis baru dari shape ditambahkan `drawShape` dari `Graphics Editor` harus diperbaiki untuk menyesuaikan perubahan.

Pelanggaran yang berkaitan dengan **Single Responsibility Principle** dapat diatas dengan cara menambahkan method `draw` dalam `IShape` sehingga setiap shape harus mengimplementasikannya.

```Java
public interface IShape {
    String draw();
}
```

Dengan menerapkan solusi tersebut pelanggaran terhadap **Open Closed Principle** teratasi dengan sendirinya karena `drawShape` dari `GraphicsEditor` tidak lagi harus disesuaikan setiap terjadi penambahan shape.

### C. Detail Printer

Masalah yang dihadapi yaitu `printDetails` pada `DetailsPrinter` melanggar dua prinsip. Prinsip pertama yaitu **Single Responsibility Principle** karena harus menentukan operasi yang dilakukan untuk setiap jenis `Employee`. Yang kedua melanggar prinsip **Open Closed Principle** karena untuk setiap jenis `Employee` baru yang ditambahkan, `printDetails` pada `DetailsPrinter` harus mengalami penyesuaian.

Untuk mengatasi hal tersebut setiap jenis Employee harus mengimplementasikan suatu interface untuk digunakan oleh `printDetails` pada `DetailsPrinter`. Pada java `toString()` dapat digunakan sehingga pembuatan interface baru tidak perlu dilakukan.

```Java
public class Employee {
    @Override
    public String toString() {
        return this.name;
    }
}

public class Manager extends Employee {
    @Override
    public String toString() {
        return super.toString() + "Documents: " + String.join(System.lineSeparator(), this.documents);
    }
}
```

### D. Recharge

Generalisasi dari `Robot` dan `Employee` adalah `Worker`. Jika `Worker` mengimplementasikan kedua interface `ISleeper` dan `IRechargeable` akan melanggar prinsip **Interface Segregation Principle** karena akan terdapat method yang harus diimplementasi untuk memenuhi constraint interface namun tidak digunakan.

```Java
public class Employee extends Worker {
    public override void Recharge()
    {
        throw new IllegalStateException("Employees cannot recharge");
    }
}

public class Robot extends Worker {
    public override void Sleep()
    {
        throw new IllegalStateException("Robots cannot sleep");
    }
}
```

### E. Security Door

`ISecurityUI` merupakan generalisasi dari `IRequestKeyCard` dan `IRequestPinCode`. Meskipun demikian `requestKeyCard()` dan `requestPinCode()` tidak dapat berada dalam `ISecurityUI` karena hanya salah satu yang digunakan oleh `PinCodeCHeck` dan `KeyCardCheck` sehingga akan melanggar **Interface Segregation Principle**. Dalam hal ini `ISecurityUI` berfungsi sebagai adapter.

```Java
public interface ISecurityUI  {
    String requestKeyCard();

    int requestPinCode();
}

public class KeyCardCheck extends SecurityCheck {
    // securityUI hanya menggunakan requestKeyCard(), melanggar ISP
    private final ISecurityUI
    securityUI;

    @Override
    public Boolean validateUser() {
        return this.isValid(this.securityUI.requestKeyCard());
    }
}

public class PinCodeCheck extends SecurityCheck {
    // securityUI hanya menggunakan requestPinCode(), melanggar ISP
    private final ISecurityUI
    securityUI;

    @Override
    public Boolean validateUser() {
        return this.isValid(this.securityUI.requestPinCode());
    }
}
```