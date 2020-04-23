public class Main {
    public static void main(String[] args) {

        Employees[] empArr = new Employees[5]; {
            empArr[0] = new Employees("John Johnson", "director","Johnson_J@mail.ru",1112223344,100000,53 );
            empArr[1] = new Employees("Emily Smith","secretary","smith_e@mail.ru",1113334455,35000,34);
            empArr[2] = new Employees("Til Schneider","Lawyer","schneider_t@mail.ru",1115522,60000,45);
            empArr[3] = new Employees("Alhassane Kado", "engineer","kado_a@mail.ru",1117711,70000,38);
            empArr[4] = new Employees("Antoine Roi", "Accountant", "roi_a@mail.ru",1121212,55000,32);
        }

        System.out.println("Older than 40:");
        for (int i = 0; i < empArr.length; i++) {
            int age;
            if(empArr[i].getAge() > 40){
                System.out.println("№ " + (i+1) + ": ");
                empArr[i].infoFull();
            }
        }




    }
}
