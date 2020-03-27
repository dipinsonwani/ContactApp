
import javax.swing.JTable;


public class ContactTable extends JTable {

    public ContactTable() {
        this.setModel(new MyModel());
    }
}