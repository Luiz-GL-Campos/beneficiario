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
    <script type="text/javascript">
        function consultaCep(){
            let cep = document.querySelector("#cep").value;
            if (cep.length === 8) {
                console.log(cep);
            }
        }
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
            <form>
                <div class="mb-3">
                    <label for="nome" class="form-label">Nome Completo</label>
                    <input type="name" class="form-control" id="nome">
                </div>
                <div class="row">
                    <div class="col">
                        <div class="mb-3">
                            <label for="dataNascimento" class="form-label">Data de Nascimento</label>
                            <input type="date" class="form-control" id="dataNascimento">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="cpf" class="form-label">CPF</label>
                            <input type="text" class="form-control" id="cpf">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="rg" class="form-label">RG</label>
                            <input type="text" class="form-control" id="rg">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="orgaoEmissor" class="form-label">Orgao emissor</label>
                            <input type="text" class="form-control" id="orgaoEmissor">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="dataEmissao" class="form-label">Data de emissao</label>
                            <input type="date" class="form-control" id="dataEmissao">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="genero" class="form-label">Genero</label>
                        <select class="form-select" aria-label="Default select example">
                            <c:forEach var="genero" items="${generos}">                              
                                <option value="genero.idGenero"><c:out value="${genero.tipoGenero}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <label for="nivelEscolaridade" class="form-label">Nivel Escolaridade</label>
                        <select class="form-select" aria-label="Default select example">
                            <c:forEach var="escolaridade" items="${escolaridades}">                              
                                <option value="escolaridade.idEscolaridade"><c:out value="${escolaridade.nivelEscolaridade}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <label for="tipoTelefone" class="form-label">Tipo de Telefone</label>
                        <select class="form-select" aria-label="Default select example">
                            <c:forEach var="tipoTelefone" items="${tiposTelefone}">                              
                                <option value="tipoTelefone.idTipoTelefone"><c:out value="${tipoTelefone.descricaoTipoTelefone}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="telefone" class="form-label">Telefone</label>
                            <input type="text" class="form-control" id="telefone">
                        </div>
                    </div>
                </div>
                <div class="mb-3">
                  <label for="email" class="form-label">Email</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                  <div id="emailHelp" class="form-text">Nos nunca compartilharemos seu email com mas ninguem.</div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="mb-3">
                            <label for="cep" class="form-label">CEP</label>
                            <input type="text" class="form-control" id="cep" onkeyup="consultaCep()">
                        </div>
                    </div>
                    <div class="col">
                        <label for="uf" class="form-label">UF</label>
                        <select class="form-select" aria-label="Default select example">
                            <option selected>Estado</option>
                            <c:forEach var="estado" items="${estados}">                              
                                <option value="estado.idEstado"><c:out value="${estado.siglaEstado}"/></option>                                  
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="municipio" class="form-label">Municipio</label>
                            <input type="text" class="form-control" id="municipio">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="bairro" class="form-label">Bairro</label>
                            <input type="text" class="form-control" id="bairro">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="endereco" class="form-label">Endereco</label>
                            <input type="text" class="form-control" id="endereco">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="numero" class="form-label">Numero</label>
                            <input type="text" class="form-control" id="numero">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="mb-3">
                            <label for="banco" class="form-label">Banco</label>
                            <select class="form-select" aria-label="Default select example">
                                <c:forEach var="banco" items="${bancos}">                              
                                    <option value="banco.codBanco"><c:out value="${banco.nomeBanco}"/></option>                                  
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="agencia" class="form-label">Agencia</label>
                            <input type="text" class="form-control" id="agencia">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="numeroConta" class="form-label">Numero da Conta</label>
                            <input type="text" class="form-control" id="numeroConta">
                        </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="tipoConta" class="form-label">Tipo de Conta</label>
                            <select class="form-select" aria-label="Default select example">
                                <c:forEach var="tipoConta" items="${tiposConta}">                              
                                    <option value="tipoConta.idTipoConta"><c:out value="${tipoConta.tipoConta}"/></option>                                  
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
              </form>
        </div>
    </div>
</body>

</html>