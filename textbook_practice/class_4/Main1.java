package class_4;

class Main1 {
    void myMeth() {
        int i;

        for(i=0; i<10; i++) {
            if(i == 5) return;
            System.out.println(i);
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.myMeth();
    }
}