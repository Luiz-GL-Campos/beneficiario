function calcular() {
    const tn1 = document.querySelector('#n1').value;
    const tn2 = document.querySelector('#n2').value;
  
    const operacao = document.querySelector('#operacao').value;
    let resultado = document.querySelector('#resultado');
  
    const n1 = Number(tn1);
    const n2 = Number(tn2);
    let s = 0; 

    if (operacao === 'adicao') {
        s = n1 + n2;

    }else if (operacao === 'subtracao') {
        s = n1 - n2;

    }else if (operacao === 'multiplicacao') {
        s = n1 * n2;

    }else if (operacao === 'divisao') {
        s = n1 / n2;

    }

    resultado.innerHTML = `O resultado é ${s}`;
    
    return false;
}