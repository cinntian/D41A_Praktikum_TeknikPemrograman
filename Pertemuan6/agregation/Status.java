package agregation;

import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */

class Status {
    String nStatus;
    private List<Employee> emp;
    
    Status(String nStatus, List<Employee> emp){
        this.nStatus = nStatus;
        this.emp = emp;
    }

    public List<Employee> getEmp() {
        return emp;
    }
    
}
