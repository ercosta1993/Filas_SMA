class Main {
    public static void main(String[] args) {
        RND r = new RND(12, 23, 4534535, 65);
        
        // teste RND
        for (int i = 1; i < 1000; i++) {
            System.out.println(r.next());
        }
        
        /**
         * Testes:
         * G/G/1/5, chegadas entre 2..4, atendimento entre 3..5
         * G/G/2/5, chegadas entre 2..4, atendimento entre 3..5
         */
        
        
        
    }
}
