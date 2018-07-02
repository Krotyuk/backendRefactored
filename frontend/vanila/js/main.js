// polyfills
require('whatwg-fetch');
require('babel-polyfill');
module.hot.accept();
// resources
const createRequest = require('./create-request');

const resultBlock = document.querySelector('.result');

createRequest('/api/v001/books').then((result) => {
  resultBlock.innerHTML = JSON.stringify(result);
});
