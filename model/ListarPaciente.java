package Atividade3.model;

import java.util.ArrayList;
import java.util.List;

public class ListarPaciente {

    private static final List<Paciente> listarPaciente = new ArrayList<>();

    public static List<Paciente> Listar() {
        return listarPaciente;
    }

    public static void Adicionar(Paciente paciente) {
        listarPaciente.add(paciente);
    }

}
