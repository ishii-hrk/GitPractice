package Practice2;

public class practice201 {
	public static void main(String[] args) {
		// Employeeクラスのオブジェクトを作成
        practice201Employee employee = new practice201Employee();
        
        // Employeeオブジェクトに社員番号と社員名をセット
        employee.setData(1234, "山田");
        
        // Employeeオブジェクトの社員番号を出力
        System.out.println("社員番号：" + employee.getId());
        
        // Employeeオブジェクトの社員名を出力
        System.out.println("社員名：" + employee.getName());
	}

}

