package calcularIMC;

public class persona {
    private float peso;
    private float estatura;
    private float imc;
  
  public float calcular(){
    imc = peso / (estatura * estatura);
    return imc;
  }

  public void setPeso(float peso){
    this.peso = peso;
  }

  public float getpeso(){
    return peso;
  }

  public void setEstatura(float estatura){
    this.estatura = estatura;
  }

  public float getEstatura(){
    return estatura;
  }
}