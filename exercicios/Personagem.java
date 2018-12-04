public class Personagem {
    int vida = 2;
    int forca = 1;

    Personagem(int vida){
      this.vida = vida;
    }

    Personagem(int vida, int forca){
      this(vida);
      this.forca = forca;
    }

    void pocaoVida(int vida){
      this.vida += vida;
    }

    public static void main(String[] args) {
      Personagem cleiton = new Personagem(5, 5);
      cleiton.pocaoVida(10);
      cleiton.pocaoVida(30);
    }
}
