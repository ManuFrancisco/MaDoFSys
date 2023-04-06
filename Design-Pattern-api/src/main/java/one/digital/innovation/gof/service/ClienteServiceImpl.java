package one.digital.innovation.gof.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import one.digital.innovation.gof.model.Cliente;
import one.digital.innovation.gof.model.ClienteRepository;
import one.digital.innovation.gof.model.Endereco;
import one.digital.innovation.gof.model.EnderecoRepository;

public class ClienteServiceImpl implements ClienteService {
	
	// singleton:
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	private ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// Buscar cliente por ID, caso existir		
		Optional<Cliente> clienteBD = clienteRepository.findById(id);
		if(clienteBD.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}
	
	@Override
	public void deletar(Long id) {
		// Deletar o cliete por ID
		clienteRepository.deleteById(id);
	}
	
	private void salvarClienteComCep(Cliente cliente) {
		// Verificar se o endereço do cliente já existe
		String cep = cliente.getEndereco().getCep();
		enderecoRepository.findById(cep);
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
		// Caso não existe, integrar com o viaCep e persistir o retorno
		Endereco novoEndereco = viaCepService.consultarCep(cep);
		enderecoRepository.save(novoEndereco);
		   return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}

}
