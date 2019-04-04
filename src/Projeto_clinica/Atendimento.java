package Projeto_clinica;

public class Atendimento {
    String  data_consulta;
    double valor_consulta;
    Paciente paciente;
    Medico medico;

     Atendimento( String data_consulta, double valor_consulta, Paciente paciente, Medico medico){
         this.data_consulta =  data_consulta;
         this.valor_consulta = valor_consulta;
         this.paciente = paciente;
         this.medico = medico;


     }
}
