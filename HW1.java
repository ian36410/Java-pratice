public class HW1 {
    public static class EmployeeHierarchy {
        private int[] parent;
        private int[] size;
        private int[] seniority;

        public EmployeeHierarchy(int n) {
            parent = new int[n];
            size = new int[n];
            seniority = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
                seniority[i] = 0;
            }
        }

        // set seniority of employees
        public void setSeniority(int employeeId, int newSeniority) {
            if (employeeId < 0 || employeeId > seniority.length) {
                System.out.println("Invalid employee ID");
                return;
            }

            seniority[employeeId] = newSeniority;
        }

        public int departmentSize(int p) {
            // Modify code in this method
            int deptSize = 0;
            
            return deptSize;
        }

        public int findSupervisor(int p) {
            // Modify code in this method
        	
            return p;
        }

        public int mergeDepartment(int p, int q) {
            // Modify code in this method
            int deptSize = 0;
            
            return deptSize;
        }

        public int resign(int employeeId) {
            // Modify code in this method
            int deptSize = 0;
            
            
           return deptSize;
        }

        public int getNumberOfDepartments() {
            // Modify code in this method
            int count = 0;
           
            return count;
        }

    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;
        EmployeeHierarchy organization = new EmployeeHierarchy(numberOfEmployees);

        organization.setSeniority(0, 1);
        organization.setSeniority(1, 2);
        organization.setSeniority(2, 15);
        organization.setSeniority(3, 7);
        organization.setSeniority(4, 9);
        organization.setSeniority(5, 10);
        organization.setSeniority(6, 6);
        organization.setSeniority(7, 12);
        organization.setSeniority(8, 16);
        organization.setSeniority(9, 3);

        organization.mergeDepartment(3, 6);
        organization.mergeDepartment(0, 3);
        organization.mergeDepartment(1, 0);
        organization.mergeDepartment(2, 4);
        organization.mergeDepartment(7, 8);
        organization.mergeDepartment(9, 6);
        organization.mergeDepartment(4, 5);

        int supervisor = organization.findSupervisor(9);
        System.out.print("The supervisor of employee 9 is ");
        System.out.println(supervisor);
        System.out.println(" ");
        // expected output: 
        // The supervisor of employee 9 is 3
        
        supervisor = organization.findSupervisor(3);
        System.out.print("The supervisor of employee 3 is ");
        System.out.println(supervisor);
        System.out.println(" ");
        // expected output: 
        // The supervisor of employee 3 is 3
        
        int departmentSize = organization.resign(3);
        int newSupervisorAfterResign = organization.findSupervisor(1);
        System.out.print("After employee 3 resigns, the new supervisor of the department is ");
        System.out.println(newSupervisorAfterResign); 
        System.out.println("The size of employee 3's original department becomes " + departmentSize); 
        System.out.println(" ");
        // expected output:
        // After employee 3 resigns, the new supervisor of the department is 6
        // The size of employee 3's original department becomes 4

        departmentSize = organization.mergeDepartment(4, 6);
        int newSupervisorAfterMerging = organization.findSupervisor(4);
        System.out.print("After merging the departments of employee 4 and employee 6, the supervisor of the new department is ");
        System.out.println(newSupervisorAfterMerging);
        System.out.println("The size of the new department is " + departmentSize);
        System.out.println(" ");
        // expected output: 
        // After merging the departments of employee 4 and employee 6, the supervisor of the new department is 6
        // The size of the new department is 7
        
        int numberOfDepartments = organization.getNumberOfDepartments();
        System.out.print("The number of departments is ");
        System.out.println(numberOfDepartments);
        System.out.println(" ");
        // expected output:
        // The number of departments is 2

        departmentSize = organization.resign(6);
        int currentSupervisor7AfterResign6 = organization.findSupervisor(7);
        System.out.print("After employee 6 resigns, the supervisor of employee 7  is ");
        System.out.println(currentSupervisor7AfterResign6);
        System.out.println("The size of employee 6's original department becomes " + departmentSize); 
        System.out.println(" ");
        // expected output:
        // After employee 6 resigns, the supervisor of employee 7  is 8
        // The size of employee 6's original department becomes 6

        departmentSize = organization.mergeDepartment(2, 8);
        int newSupervisorAfterMerging2And8 = organization.findSupervisor(2);
        System.out.print("After merging the departments of employee 2 and employee 8, the supervisor of the new department is ");
        System.out.println(newSupervisorAfterMerging2And8);
        System.out.println("The size of the new department is " + departmentSize);
        System.out.println(" ");
        // expected output:
        // After merging the departments of employee 2 and employee 8, the supervisor of the new department is 2
        // The size of the new department is 8

        int currentSupervisor8 = organization.findSupervisor(8);
        System.out.print("The supervisor of employee 8 is ");
        System.out.println(currentSupervisor8);
        System.out.println(" ");
        // expected output: 
        // The supervisor of employee 8 is 2

        departmentSize = organization.resign(1);
        int newSupervisorAfterResign1 = organization.findSupervisor(5);
        System.out.print("After employee 1 resigns, the new supervisor of employee 5's department is ");
        System.out.println(newSupervisorAfterResign1);
        System.out.println("The size of employee 1's original department becomes " + departmentSize); 
        System.out.println(" ");
        // expected output: 
        // After employee 1 resigns, the new supervisor of employee 5's department is 2
        // The size of employee 1's original department becomes 7
        
        int numberOfDepartmentsAfterOperations = organization.getNumberOfDepartments();
        System.out.print("The number of departments is ");
        System.out.println(numberOfDepartmentsAfterOperations);
        System.out.println(" ");
        // expected output:
        // The number of departments is 1
    }
}
