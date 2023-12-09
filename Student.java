import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "users")
public class Student {
    @DatabaseField(id = true)
    private int id;
    @DatabaseField(canBeNull = false)
    private String name;
    @DatabaseField(canBeNull = false)
    private String adress;
    @DatabaseField(canBeNull = false)
    private int age;

    public Student(){

    }
    public Student(int id, String name, String adress, int age) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAdress() {
        return this.adress;
    }
    public int getAge(){
        return this.age;
    }
}