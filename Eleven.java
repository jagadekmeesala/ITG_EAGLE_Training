import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("John Doe", 30, 123456);

        FileOutputStream fos = new FileOutputStream("employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.close();
        fos.close();
        System.out.println("Employee object serialized successfully!");

        FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee deserializedEmployee = (Employee) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Deserialized Employee:");
        System.out.println("Name: " + deserializedEmployee.getName());
        System.out.println("Age: " + deserializedEmployee.getAge());
        System.out.println("ID: " + deserializedEmployee.getId());
    }
}

class Employee implements java.io.Serializable {
    public String name;
    public int age;
    public int id;

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
