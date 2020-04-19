package hitesh.asimplegame;

import java.util.Random;

public class RandomQuestion extends Question{

    Random random = new Random();

    int questionNum1;
    int questionNum2;
    int result;

    int gapNum1;
    int gapNum2;
    int gapNum3;

    int option1;
    int option2;
    int option3;

    public RandomQuestion(){

        questionNum1=random.nextInt(10);
        questionNum2=random.nextInt(10);
        result=questionNum1+questionNum2;

        gapNum1=random.nextInt(4);

        do{
            gapNum2 =random.nextInt(6);
        }while(gapNum1 == gapNum2);
        do{
            gapNum3 =random.nextInt(10);
        }while(gapNum1 == gapNum3 || gapNum2 == gapNum3);
        if(gapNum1 !=0&& gapNum2 !=0){
            gapNum3 =0;
        }

        option1 = result+ gapNum1;
        option2 = result+ gapNum2;
        option3 = result+ gapNum3;

    }

    @Override
    public String getQUESTION() {
        return String.valueOf(questionNum1)+"+"+String.valueOf(questionNum2)+" = ?";
    }

    @Override
    public String getANSWER() {
        return String.valueOf(result);
    }

    @Override
    public String getOPTA() {
        return String.valueOf(option1);
    }

    @Override
    public String getOPTB() {
        return String.valueOf(option2);
    }

    @Override
    public String getOPTC() {
        return String.valueOf(option3);
    }
}
