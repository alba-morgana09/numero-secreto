🎁 Amigo Secreto

Projeto desenvolvido em HTML, CSS e JavaScript para simular um sorteio de Amigo Secreto.

O objetivo é permitir que os participantes sejam cadastrados em uma lista e, ao clicar no botão de sortear, cada pessoa receba um amigo secreto diferente (garantindo que ninguém tire a si mesmo).

🚀 Funcionalidades

➕ Adicionar participantes digitando o nome no campo de texto.

🗑️ Limpar a lista de participantes.

🎲 Sortear automaticamente garantindo que ninguém tire o próprio nome.

📋 Exibir os participantes e os resultados formatados na tela.

🎨 Interface estilizada com CSS para melhor visualização.

🛠️ Tecnologias utilizadas

HTML5 → estrutura da página.

CSS3 → estilização e layout responsivo.

JavaScript (ES6) → lógica do sorteio e manipulação do DOM.

Visual Studio Code → editor utilizado para escrever e organizar o projeto.

📂 Estrutura de pastas
AmigoSecreto/
│
├── assets/                  # imagens utilizadas
│   ├── amigo-secreto.png
│   └── play_circle_outline.png
│
├── index.html               # página principal
├── style.css                # estilos da interface
├── app.js                   # lógica em JavaScript
└── README.md                # documentação do projeto

📝 Como o projeto foi desenvolvido no VS Code

Configuração inicial

Abri o Visual Studio Code e criei uma pasta chamada AmigoSecreto.

Dentro dela criei os arquivos: index.html, style.css e app.js.

HTML (index.html)

Estruturei a página com cabeçalho, campo de input, botões e seções para Participantes e Resultado.

Vinculei o arquivo style.css e o app.js ao HTML.

CSS (style.css)

Fiz o reset básico (margin, padding, box-sizing).

Estilizei o cabeçalho com cor de fundo azul e o botão principal com gradiente laranja.

Centralizei as listas, removi os marcadores (list-style: none) e deixei o layout mais limpo.

JavaScript (app.js)

Criei um array para armazenar os nomes.

Programei funções para:

Adicionar participantes (sem duplicados).

Limpar a lista.

Sortear os nomes utilizando um algoritmo de derangement (embaralhar sem repetir o próprio nome).

Atualizei a interface dinamicamente com innerHTML para exibir os participantes e os resultados.

Testes no navegador

Utilizei a extensão Live Server no VS Code para abrir o projeto no navegador e testar em tempo real.

Corrigi problemas de cache (Ctrl+Shift+R) e pequenos ajustes de sintaxe.

▶️ Como executar

Baixe ou clone este repositório.

Abra a pasta no Visual Studio Code.

Abra o arquivo index.html com Live Server (ou clique duas vezes no arquivo para abrir no navegador).

Digite os nomes dos participantes, clique em Adicionar e depois em Sortear amigo.

📸 Exemplo de uso

📌 Melhorias futuras

Exportar os resultados em PDF ou TXT.

Adicionar opção de envio automático por e-mail.

Criar uma versão mobile mais amigável.
