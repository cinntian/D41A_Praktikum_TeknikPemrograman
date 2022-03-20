package agregation;

import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */

public class Department {
    String nDepartment;
    private List<Status> sts;
    
    Department(String nDepartment, List<Status> sts){
        this.nDepartment = nDepartment;
        this.sts = sts;
    }

    public int getTotalEmployeeinDepartment(){
    int jml = 0;
    List<Employee> emp;

    for(Status st : sts){
        emp = st.getEmp();
        for(Employee e : emp){
            jml++;
        }
    }
    return jml;
    }
    
}
