/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.github.saulocalixto.aula2528jpa.model.Veiculo;
import com.github.saulocalixto.aula2528jpa.repositorio.RepositorioVeiculo;
import com.github.saulocalixto.aula2528jpa.repositorio.RepositorioVeiculoImpl;
import org.h2.tools.Server;

import java.sql.SQLException;

/**
 *
 * @author Alunoinf_2
 */
public class main {
    public static void main(String[] args) throws SQLException {
        Server server = Server.createTcpServer().start();
        RepositorioVeiculo repositorio = new RepositorioVeiculoImpl();
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("VW");
        veiculo.setAnoModelo(2015);
        veiculo.setAnoFabricacao(2014);
        veiculo.setPotenciaMotor(76);
        repositorio.criar(veiculo);
        Veiculo veiculoConsultado = repositorio.consulte(1l);
        System.out.println("Consultado: " + veiculo.getMarca());
        System.out.println("Consultado: " + veiculoConsultado.getAnoFabricacao());
        veiculoConsultado.setAnoFabricacao(2016);
        repositorio.atualize(veiculoConsultado);
        veiculoConsultado = repositorio.consulte(1l);
        System.out.println("Atualizado: " + veiculoConsultado.getAnoFabricacao());
        repositorio.apague(veiculoConsultado);
        Veiculo veiculoApagado = repositorio.consulte(1l);
        System.out.println("Apagado: " + veiculoApagado);
        repositorio.close();
    }
}
