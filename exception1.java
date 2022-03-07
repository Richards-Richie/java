class exception1{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int res=10;
        try{
            res=a/b;
        }catch(Exception e){
                e.printStackTrace();
        }
        System.out.println(res);

    }
}