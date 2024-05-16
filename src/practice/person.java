package practice;

public class person {


        String name;
        int age;

        public person (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void Introduce(){
            System.out.println(name+ "：我是"+ name);
        }

        public void ASK(String q){
            System.out.println(name + ":"+q);
        }

}
