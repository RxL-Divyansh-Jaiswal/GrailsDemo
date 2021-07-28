package demoapp

class EmployeeController {

    def employeeService

    def index() { }

    def create(){
        try{
            employeeService.createEmployee(params)
            render "Employee created"
        }catch(Exception e){
            println e
        }
    }

}
