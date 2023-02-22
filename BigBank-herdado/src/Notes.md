# Construtores
- O construtor Padrão é aquele que não nenhum parâmetro
- Um construtor é chamado na inicialização/criação do projeto do objeto.

# Code smells
- Esses problemas no código ou design também são chamados de Code Smells (mau cheiro no código).
- Repetição de código
- Muitos ifs que nunca param de crescer
- Código pouco expressivo.

# herança
- public class Gerente extends Funcionario{...}
- A classe Gerente herdará todo o comportamento da classe Funcionario. Isto é, todos os métodos públicos podem ser utilizados na classe Gerente também.
- A classe Gerente herda todas as características da classe Funcionario. Todos os atributos também fazem parte do Gerente.
- Ao estender a classe Funcionario se diz que o Gerente é um Funcionario.

# Visibilidade
- A ordem correta dos modificadores de visibilidade, da menor visibilidade para a maior: private < protected < public
- Private: Apenas visível dentro da classe
- Protected: Visível dentro da classe e também para os filhos 	<br> -	Também é relacionada com herança
- Public: visível em todo lugar

# Sobrescrita
- Sobrescrita é um conceito importante na herança
- Para fazer uma sobrescrita precisamos colocar a mesma assinatura: <br> - Istoe é, a mesma visibilidade, mesmo retorno, mesmo nome e o mesmos parâmetros.

# Dominando Herança
- Uma classe pode ter várias filhas, mas apenas uma mãe.
- A partir de uma instância de uma classe filha, podemos chamar qualquer método público que tenha sido declarado na classe mãe.
- Uma classe pode ter diversas "Filhas e nteas" (que herdam umas das outras), mas não podemos escolher o que será herdado.

# Private x Protected
- Só a própria classe enxerga atributos/métodos (private) enquanto (protected) é visto pela própria classe mais as classes filhas.
































