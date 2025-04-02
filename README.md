# Pedido App
Aplicação cliente usando Spring Boot 3.1.2, Spring Cloud, Java 17 e outras tecnologias.

# PASSOS PARA SUBIR A APLICAÇÃO:
1. Criar os pacotes :
   - $ cd [diretório-raiz]
   - $ mvn clea install
   - $ mvn spring-boot:run

3. Endpoints:
      Porta das aplicação: 8081
      ### Ele irá se comunicar com o server através das portas 8078 e 8079 se a anterior estiver fora.

2.1. Consulta todos :
[GET]   http://localhost:8081/api/pedidos

2.2. Consulta por Id :
[GET]   http://localhost:8081/api/pedidos/[id]

2.3. Inseri pedido:
[POST] http://localhost:8081/api/pedidos
Body - raw - JSON:
{
    "dataPedido": "2025-04-01",
    "situacaoPedido": "ABERTO",
    "descricaoPedido": "PEDIDO DE MATERIAL DE ESCRITORIO",
    "totalPedido": 45.00,
    "cliente": {
        "id": 1,
        "nomeCliente": "ALEXANDRE CARDOSO DE MELO",
        "tipoCliente": "PESSOA_FISICA",
        "documentoCliente": "CPF",
        "numeroCliente": "23465798020",
        "endereco": {
            "id": 1,
            "ruaEndereco": "RUA DA PAZ",
            "numeroEndereco": "545",
            "bairroEndereco": "FELICIDADE",
            "cepEndereco": "55600123",
            "cidadeEndereco": "SANTO ANTONIO",
            "ufEndereco": "SC"
        }
    },
    "pedido_produtos": [
        {
            "id": 3,
            "descricaoProduto": "CANETA PRETA BIC",
            "unidadeProduto": "UN",
            "quantidadeProduto": 5.0,
            "valorProduto": 6.00,
            "totalProduto": 30.0
        }
    ]
}
