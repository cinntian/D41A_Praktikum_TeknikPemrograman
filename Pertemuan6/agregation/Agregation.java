package agregation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */

public class Agregation {
    public static void main(String[] args) {
        Employee e1 = new Employee("Cici", 001, "pegawai tetap");
        Employee e2 = new Employee("Ayu", 002, "pegawai tetap");
        Employee e3 = new Employee("Tarisa", 003, "pemagang");
        Employee e4 = new Employee("Hakim", 004, "pemagang");
        Employee e5 = new Employee("Roy", 005, "pemagang");
        
        List <Employee> pegawai_tetap_emp = new ArrayList<Employee>();
        pegawai_tetap_emp.add(e1);
        pegawai_tetap_emp.add(e2);
        
        List <Employee> pemagang_emp = new ArrayList<Employee>();
        pemagang_emp.add(e3);
        pemagang_emp.add(e4);
        pemagang_emp.add(e5);
        
        Status tetap = new Status("pegawai tetap", pegawai_tetap_emp);
        Status magang = new Status("pemagang", pemagang_emp);
        
        List <Status> sts = new ArrayList<Status>();
        sts.add(tetap);
        sts.add(magang);
        
        Department dpt = new Department("Keuangan", sts);
        System.out.print("Total employee in Department: ");
        System.out.print(dpt.getTotalEmployeeinDepartment());
        System.out.print("\n");
        
    }
    
}
