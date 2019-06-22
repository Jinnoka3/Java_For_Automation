package objects.objects3;
import java.util.Random;

public class Dog {
    String name;
    String size;
    int age;

    private enum DogSizes {
        small,
        medium,
        big;
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

    Dog(String name, String size, int age){
        this.name = name;
        this.size = size;
        this.age = age;

        if(name.isEmpty()){
            this.name = randomName(name);
        }
        if (size.isEmpty()) {
            this.size = randomSize(size);
        }
        if (age == 0) {
            this.age = randomAge(age);
        }
    }

    public String randomName(String k)
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int) (Math.random()*10) + 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public String randomSize(String k)
    {
        int rand = (int) (Math.random()*2);
        return DogSizes.values()[rand].toString();
    }

    public Integer randomAge(int k)
    {
        return (int) (Math.random()*19) + 1;
    }

    public Integer getSize(){
        return DogSizes.valueOf(this.size).ordinal();
    }
}
