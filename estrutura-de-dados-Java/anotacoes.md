#Conceito de NO

posicao de memoria contendo um certo conteudo e uma referencia para endereco de memoria do proximo NO na determinada estrutura de dado

Conceito de Pilha

- LIFO(last in first out)
- No caso dessa estrutura as referencias nos NOs apontam para o elemento adicionado anteriormente a esse na pilha
- Métodos:
	top: Obtem o primeiro elemento da pilha porem não altera a pilha
	pop: Obtem o primeiro elemento da pilha e o remove da pilha
	push: Adiciona um elemento ao topo da pilha
	isEmpty: Retorna se a pilha esta vazia

Conceito de Fila

- FIFO(first in first out)
- No caso dessa estrutura as referencias nos NOs apontam para o próximo elemento adicionado na fila
- Métodos:
    enqueue: Adiciona um elemento ao final da fila
    dequeue: Remove o primeiro elemento da fila
    isEmpty: Retorna se a fila esta vazia

Conceito de Lista

-Me

Conceito de Lista duplamente encadeada

- Essa estrutura de dados possui duas referências em cada no, uma apontando par ao proximo no e outra para o no anterior
alem de referencias para o primeiro e ultimo elemento
- Metodos:
- .add(elemento): Adiciona um elemento no fim da lista
		