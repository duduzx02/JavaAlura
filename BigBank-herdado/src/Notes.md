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

# Pilares da herança

- <br> - Herança com Java
- Reutilização e Polimorfismo

# O que é polimorfismo?
- No mundo do OO o polimorfismo permite referências de tipos de classes mais genéricas referenciem objetos mais específicos
<br> ex: Funcionario f = new Gerente();

# Herança e Construtores
- Quando uma classe herda de outra, ela também recebe seus atributos e métodos.
- Mas não herda seus construtores.

# Sobre Construtores
- O Construtor default do java deixa de existir a partir do momento que algum é declarado na classe.
- Assim que criarmos o nosso próprio construtor, o construtor default (sem parâmetro) deixa de existir, No entanto, nada impede adicionar o construtor default explicitamente.

# Sobre Classes abstratas
- Não podem ser instanciadas. Para instanciar, devemos criar primeiro uma classe filha não abstrata.
- Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar um objeto dessa clase. Para instanciar é preciso criar primeiro uma classe filha não abstrata.
- Classes abstratas são úteis quando queremos utilizar comportamentos e atributos base em classes com comportamento em comum.

# Sobre Méotods abstratos
- Não possuem corpo (implementação), apenas definem a assinatura.
- Um método abstrato define apenas a assinatura (visibilidade, retorno, nome do méotodo e parâmetro).
- Usamos métodos abstratos quando queremos "Forçar" que um filho concreto (classe concreta) implemente o método.

# Mais Sobre classes abstratas
- Podem ter atributos, uma classe abstrata é uma classe normal, só não pode instanciar e pode ter métodos abstratos.
- Podem ter métodos concretos (com implementação).
- Pode ter métodos abstratos (sem implementação), uma classe abstrata pode ter métodos sem implementação. Dessa forma obrigamos um filho implementar o método.
- Não podem ser instanciadas, O que é abstrato (a classe) não pode se tornar concreto (objeto). Por isso não podemos instanciar objetos de uma classe abstrata.

# Herdando de várias classes
- Com o uso das interfaces conseguimos polimorfismo sem herança

# Conceitos de Interfaces
- A interface é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato)

# Classes Abstratas x Interfaces
- Podemos estender apenas uma classe abstrata, mas podemos implementar várias interfaces.
- Todos 































