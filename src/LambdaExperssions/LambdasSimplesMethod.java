package LambdaExperssions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LambdasSimplesMethod {

	
		
		private String emailDevedor;
		private double valor;
		private LocalDate dataVencimento;
		
		
		public LambdasSimplesMethod(String emailDevedor, double valor, LocalDate dataVencimento) {
			super();
			this.emailDevedor = emailDevedor;
			this.valor = valor;
			this.dataVencimento = dataVencimento;
		}

		public String getEmailDevedor() {
			return emailDevedor;
		}

		public void setEmailDevedor(String emailDevedor) {
			this.emailDevedor = emailDevedor;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public LocalDate getDataVencimento() {
			return dataVencimento;
		}

		public void setDataVencimento(LocalDate dataVencimento) {
			this.dataVencimento = dataVencimento;
		}
		
		
		public String resumo() {
			String dataVencimento = this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			return String.format("Valor R$ %s, vencimento: %s", this.valor, dataVencimento);
		}

		public void setNotificacaoEnviada(boolean b) {
			// TODO Auto-generated method stub
			
		}
		
		

	
}
