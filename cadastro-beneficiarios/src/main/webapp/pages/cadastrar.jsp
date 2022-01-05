<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"
    >
    <link rel="stylesheet" type="text/css" href="pages-style.css"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous">
    </script>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="<c:url value='/'/>">
                <img src="../image/logotipoincra.jpeg" alt="" width="50" height="50" class="d-inline-block align-text-top">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="<c:url value='/'/>">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Beneficiario
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="<c:url value='/iniciar-cadastro'/>">Cadastrar</a></li>
                            <li><a class="dropdown-item" href="editar.jsp">Editar</a></li>
                            <li><a class="dropdown-item" href="excluir.jsp">Excluir</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <form id="formCadastrar" action="<c:url value='/realizar-cadastro'/>" method="POST">
                <input type="hidden" id="nomeMunicipio"/>
                <div class="mb-3">
                    <label for="nome" class="form-label">Nome Completo</label>
                    <input type="text" name="nomeCompleto" class="form-control" id="nomeCompleto" required>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="mb-3">
                            <label for="dataNascimento" class="form-label">Data de Nascimento</label>
                            <input type="date" class="form-control" id="dataNascimento" name="dataNascimento" required>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="cpf" class="form-label">CPF</label>
                            <input type="text" name="cpf" class="form-control" id="cpf" required>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="rg" class="form-label">RG</label>
                            <input type="text" name="rg" class="form-control" id="rg">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="orgaoEmissor" class="form-label">Orgao emissor</label>
                            <input type="text" name="orgaoEmissor" class="form-control" id="orgaoEmissor">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="dataEmissao" class="form-label">Data de emissao</label>
                            <input type="date" name="dataEmissao" class="form-control" id="dataEmissao">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="genero" class="form-label">Genero</label>
                        <select id="selectGenero" name="selectGenero" class="form-select" aria-label="Default select example">
                            <c:forEach var="genero" items="${generos}">                              
                                <option value="<c:out value='${genero.idGenero}'/>"><c:out value="${genero.tipoGenero}"/></option>                                 
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <label for="nivelEscolaridade" class="form-label">Nivel Escolaridade</label>
                        <select id="selectNEscolaridade" name="selectNEscolaridade" class="form-select" aria-label="Default select example">
                            <c:forEach var="escolaridade" items="${escolaridades}">                              
                                <option value="<c:out value='${escolaridade.idEscolaridade}'/>"><c:out value="${escolaridade.nivelEscolaridade}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <label for="tipoTelefone" class="form-label">Tipo de Telefone</label>
                        <select id="selectTelefone" name="selectTelefone" class="form-select" aria-label="Default select example">
                            <c:forEach var="tipoTelefone" items="${tiposTelefone}">                              
                                <option value="<c:out value='${tipoTelefone.idTipoTelefone}'/>"><c:out value="${tipoTelefone.descricaoTipoTelefone}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="telefone" class="form-label">Telefone</label>
                            <input type="text" name="telefone" class="form-control" id="telefone" required>
                        </div>
                    </div>
                </div>
                <div class="mb-3">
                  <label for="email" class="form-label">Email</label>
                  <input type="email" name="inputEmail" class="form-control" id="inputEmail" aria-describedby="emailHelp" required>
                  <div id="emailHelp" class="form-text">Nos nunca compartilharemos seu email com mas ninguem.</div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="mb-3">
                            <label for="cep" class="form-label">CEP</label>
                            <input type="text" name="cep" class="form-control" id="cep" onkeyup="consultaCep()" required>
                        </div>
                    </div>
                    <div class="col">
                        <label for="uf" class="form-label">UF</label>
                        <select id="estado" name="estado" class="form-select" aria-label="Default select example" onchange="consultaUf()">
                            <c:forEach var="estado" items="${estados}">                              
                                <option value="<c:out value='${estado.idEstado}'/>"><c:out value="${estado.siglaEstado}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="municipio" class="form-label">Municipio</label>
                            <select name="municipio" class="form-control" id="municipio" onchange="obtemNomeMunicipio(this)"></select>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="bairro" class="form-label">Bairro</label>
                            <input type="text" name="bairro" class="form-control" id="bairro" required>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="endereco" class="form-label">Endereco</label>
                            <input type="text" name="endereco" class="form-control" id="endereco" required>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="numero" class="form-label">Numero</label>
                            <input type="text" name="numero" class="form-control" id="numero" required>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="mb-3">
                            <label for="banco" class="form-label">Banco</label>
                            <select id="selectBanco" name="selectBanco" class="form-select" aria-label="Default select example">
                                <c:forEach var="banco" items="${bancos}">                              
                                    <option value="<c:out value='${banco.codBanco}'/>"><c:out value="${banco.nomeBanco}"/></option>                                  
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="agencia" class="form-label">Agencia</label>
                            <input type="text" name="agencia" class="form-control" id="agencia" required>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="numeroConta" class="form-label">Numero da Conta</label>
                            <input type="text" name="numeroConta" class="form-control" id="numeroConta" required>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="tipoConta" class="form-label">Tipo de Conta</label>
                            <select id="selectTipoConta" name="selectTipoConta" class="form-select" aria-label="Default select example">
                                <c:forEach var="tipoConta" items="${tiposConta}">                              
                                    <option value="<c:out value='${tipoConta.idTipoConta}'/>"><c:out value="${tipoConta.tipoConta}"/></option>                                  
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </div>
    <script type="text/javascript">
        function consultaCep(){
            let cep = document.querySelector("#cep").value;
            if (cep.length === 8) {
                let consulta = new Promise(
                    function(resolve, reject){
                        let httpRequest = new XMLHttpRequest();
                        httpRequest.open("GET", `https://viacep.com.br/ws/${cep}/json/`)
                        httpRequest.onload = function() {
                            if(httpRequest.status === 200){
                                resolve(httpRequest.response);
                            } else {
                                reject("lascou")
                            }
                            console.log(httpRequest.status);
                        }
                        httpRequest.send();
                    }
                );
                consulta.then(
                    function(resposta){
                        console.log(resposta);
                        const endereco = JSON.parse(resposta);
                        document.querySelector("#nomeMunicipio").value = endereco.localidade;
                        document.querySelector("#endereco").value = endereco.logradouro;
                        document.querySelector("#bairro").value = endereco.bairro;
                        let comboEstado = document.querySelector("#estado");
                        for (let i = 0; i < comboEstado.length; i++){
                            const element = comboEstado[i];
                            console.log(element.text);
                            if(element.text === endereco.uf){
                                document.querySelector("#estado").value = element.value;
                                console.log(endereco);
                            }
                        }
                    },
                    function(erro){
                        console.log(erro);
                    },
                )
            }
        }
    
        function consultaUf(ibge){
            let uf = document.querySelector("#estado").value;
            
            let consulta = new Promise(
                function (resolve, reject) {
                    let httpRequest = new XMLHttpRequest();
                    httpRequest.open("GET", `https://servicodados.ibge.gov.br/api/v1/localidades/estados/${uf}/municipios`)
                    httpRequest.onload = function(){
                        if(httpRequest.status === 200){
                            resolve(httpRequest.response);
                        } else {
                            reject("lascou")
                        }
                        console.log(httpRequest.status);
                    }
                    httpRequest.send();
                }
            );
            consulta.then(
                function(resposta){
                    console.log(resposta);
                    const endereco = JSON.parse(resposta);
                    let comboMunicipio = document.querySelector("#municipio");
                    comboMunicipio.length = 0;
                    endereco.forEach(endereco => {
                        let opcaoMunicipio = document.createElement("option");
                        opcaoMunicipio.value = endereco.id;
                        opcaoMunicipio.text = endereco.nome;
                        comboMunicipio.add(opcaoMunicipio);
                    });
                    if(ibge){
                        document.querySelector("#municipio").value = ibge;
                    }
                },
                function(erro){
                    console.log(erro);
                },
            )
        }

        function obtemNomeMunicipio(){
            let municipios = document.querySelector("#municipio");
            let municipioSelecionado = document.querySelector("#municipio").value;
            console.log(selectMunicipio.text);
            for (let i = 0; i < municipios.length; i++) {
                const municipio = municipios[i];
                if(municipio.value === municipioSelecionado){
                    municipio.text = document.querySelector("#nomeMunicipio").value;
                }
            }
        }
    </script>
</body>

</html>