package demoapp

class Employee {
    String empName
    int empNumber
    String location

    static hasMany = [departments: Department]

    static constraints = {
        empNumber(unique: true)
    }

    static mapping = {
        table 'EMP'
        empName column: 'E_NAME'
        empNumber column: 'E_ID'
    }
}
