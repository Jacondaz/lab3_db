import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users2")
public class Student2 {
    @DatabaseField(id = true)
    private int id;
    @DatabaseField(canBeNull = false)
    private String secondname;
    @DatabaseField(canBeNull = false)
    private int index;

    public Student2(){
    }

    public Student2(int id, String secondname, int index) {
        this.id = id;
        this.secondname = secondname;
        this.index = index;
    }

    public int getId(){
        return this.id;
    }
    public String getSecondname(){
        return this.secondname;
    }
    public int getIndex(){
        return this.index;
    }

}
