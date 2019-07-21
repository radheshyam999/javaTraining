class Stuckhere
{
void llm(int x)
{
        System.out.print("i am  one ");

}

    void llm(int x, int y) {
          System.out.print("i am withe two int ");
    }
    
    void llm(int x, int y,float l) {
        System.out.print("i am    two int one  float ");
    }
    
    void llm(int x, char l) {
        System.out.print("i am  one int and char");
    }
    
    void llm(int x, char d,String s) {
        System.out.print("i am  one  car String");
    }
    
    void llm(int x,float l) {
        System.out.print("int float");
    }


    public static void main(String[] args) {
        Stuckhere Acessmethod = new Stuckhere();
        Acessmethod.llm(8,8); // it is going to work  on where two integer passed as permettwer
        
    }
}