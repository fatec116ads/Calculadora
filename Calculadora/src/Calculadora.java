import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends Frame implements ActionListener{

	Label lblnum1, lblnum2, lblresultado;
	TextField txtnum1, txtnum2, txtresultado; 
	Button btnsomar, btnsubtrair, btnmultiplicar, btndividir, btnlimpar, btnpotencia;

	public static void main (String [] args)
	{
		Calculadora executa=new Calculadora();
		executa.addWindowListener(new FechaJanela());
		executa.setVisible(true);   	   
	}  
	//Construtor tela com cor,titulo,tamanho,posição,linha e coluna
	Calculadora()
	{
		setTitle("Calculadora V 1.0");
		setSize(150,150);
		setLocation(50,50);
		setBackground(new Color(150,150,150));
		setLayout(new GridLayout(3,4));

		//Objetos

		lblnum1=new Label ("Num 1");
		lblnum1.setForeground(Color.white);
		lblnum1.setFont(new Font("",Font.BOLD,14));

		lblnum2=new Label ("Num 2");
		lblnum2.setForeground(Color.white);
		lblnum2.setFont(new Font("",Font.BOLD,14));

		lblresultado=new Label ("Resultado ");
		lblresultado.setFont(new Font("",Font.BOLD,14));

		txtnum1=new TextField ("");
		txtnum2=new TextField ("");
		txtresultado=new TextField ("");
		txtresultado.setEditable(false);

		btnsomar=new Button("+"); btnsomar.addActionListener(this);
		btnsubtrair=new Button("-");btnsubtrair.addActionListener(this);
		btndividir=new Button("/");btndividir.addActionListener(this);
		btnmultiplicar=new Button("*");btnmultiplicar.addActionListener(this);
		btnlimpar=new Button("Limpar");btnlimpar.addActionListener(this);
		btnpotencia=new Button("Potencia");btnpotencia.addActionListener(this);

		//Construtor do layout do objeto
		add(lblnum1);add(txtnum1);add(btnsomar);add(btnsubtrair);
		add(lblnum2);add(txtnum2);add(btnmultiplicar);add(btndividir);
		add(lblresultado);add(txtresultado);add(btnlimpar);add(btnpotencia);
	}

	// Tratamento dos eventos

	public void actionPerformed ( ActionEvent e) { // o "e" é uma variavel que eu escolho portanto poderia ser qualquer coisa 

		if (e.getSource()== btnlimpar) //o getSource ele busca a origem do evento (meu "e" no caso), e o evento é o botão limpar(no caso btnlimpar) 
		{
			txtnum1.setText("");
			txtnum2.setText("");
			txtresultado.setText("");

		}

		float n1,n2,resultado=0;
		n1 =0;n2=0;
		try {

			n1=Float.parseFloat(txtnum1.getText());  //parseFloat pega oq tem dentro do txtnum1 e converte e float
			n2=Float.parseFloat(txtnum2.getText());
		}
		catch (NumberFormatException erro) {
			txtresultado.setText("ERRO");

		} 

		if (e.getSource()== btnsomar) //o getSource ele busca a origem do evento (meu "e" no caso), e o evento é o botão limpar(no caso btnlimpar) 
		{
			resultado=n1+n2;

		}
		if (e.getSource()== btnsubtrair) //o getSource ele busca a origem do evento (meu "e" no caso), e o evento é o botão limpar(no caso btnlimpar) 
		{
			resultado=n1-n2;

		}
		if (e.getSource()== btnmultiplicar) //o getSource ele busca a origem do evento (meu "e" no caso), e o evento é o botão limpar(no caso btnlimpar) 
		{
			resultado=n1*n2;

		}
		if (e.getSource()== btndividir) //o getSource ele busca a origem do evento (meu "e" no caso), e o evento é o botão limpar(no caso btnlimpar) 
		{
			resultado=n1/n2;

		}         
		//Potencia       
		if (e.getSource()== btnpotencia) //o getSource ele busca a origem do evento (meu "e" no caso), e o evento é o botão limpar(no caso btnlimpar) 
		{
			resultado= (float) Math.pow(n1,n2);

		}
		txtresultado.setText(""+resultado);    
	}

}

