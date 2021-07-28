package demoapp

import grails.gorm.transactions.Transactional

@Transactional
class EmployeeService {

    def serviceMethod() {

    }

    def createEmployee(Map params){
        Employee emp = new Employee(params)

        try{
            emp.save(flush: true,failOnError:true)
            return
        }catch(Exception e){
            return e
        }
    }
}
