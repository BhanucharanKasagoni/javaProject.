class GuessNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int min=0;
        int max=10;
        int choices=5;
        int score=0;

        System.out.println("Start Guessing Number in Range of 1 to 100");
        int random_number=random.nextInt(max);
        
        for(int i=1;i<=choices;i++){
            int user_number=sc.nextInt();
            if(user_number<min||user_number>max){
                System.out.println("your number is out of range");
                break;
            }

            if(user_number<random_number){
                System.out.println("your number is lesser");
            }
            else if(user_number>random_number){
                System.out.println("your number is greater");
            }
            else{
                System.out.println("your guess number is "+user_number);
                score++;
                System.out.println("your score "+score);
                break;
            }
            if(choices==i){
            System.out.println("try again");
            System.out.println("your score "+score);
            }
        }
        if(score==1)
            System.out.println("you have guessed successfully");
        else
        System.out.println("you have failed to guess");
    }
}
