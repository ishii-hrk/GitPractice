package Practice2;

public class practice203Person {
	private String name;
	private int age;
	
	public void setData(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void introduce() {
		System.out.println("わたしの名前は" + name + "、年齢は" + age + "です。");
	}
	
	public void compare(practice203Person person) {
		// 自分の方が年上の場合
        if(age > person.getAge()) {
            System.out.println("わたくし" + name + "は、" +
                    person.getName() + "さんより" +
                    (age - person.getAge()) +
                    "歳年上です。");
        }
        // 自分の方が年下の場合
        else if(age < person.getAge()) {
            System.out.println("わたくし" + name + "は、" +
                    person.getName() + "さんより" +
                    (person.getAge() - age) +
                    "歳年下です。");
        }
        // 同じ年齢の場合
        else {
            System.out.println("わたくし" + name + "は、" +
                    person.getName() + "さんと同じ年齢です。");
        }
	}
}
