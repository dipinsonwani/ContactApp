
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


public class MyModel extends AbstractTableModel {
    
    private String[] columns;
    private Object[][] rows;
    public MyModel (){}
    
     public MyModel (Object [][] data, String[] columnsName){
         this.columns = columnsName;
         this.rows = data;
     }
     
     public Class getColumnClass(int col){
         if(col==7){return Icon.class;}
         else{
             return getValueAt(0, col).getClass();
         }
     }

    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int ColoumnIndex) {
        return this.rows[rowIndex][ColoumnIndex];
        
    }
    
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
}
