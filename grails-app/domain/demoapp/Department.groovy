package demoapp

class Department {
    String departmentName
    int departmentNumber
    String location

    static hasMany = [employees : Employee]

    static constraints = {
        departmentNumber(unique: true)
    }

    static mapping = {
        table 'DEPT'
        departmentName column: 'D_NAME'
        departmentNumber column: 'D_ID'
    }
}
