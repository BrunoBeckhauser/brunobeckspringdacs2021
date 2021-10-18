INSERT IGNORE INTO CATEGORIA(id, nome) values(1,'Brinquedos') ;
INSERT IGNORE INTO CATEGORIA(id, nome) values(2,'Video Games') ;
INSERT IGNORE INTO CATEGORIA(id, nome) values(3,'Jogos de Tabuleiro') ;

INSERT IGNORE INTO PRODUTO(id, descricao, preco, data_registro, categoria_id) values(1,'Baralho de TRUCO', 30, '2021-09-22', 1);
INSERT IGNORE INTO PRODUTO(id, descricao, preco, data_registro, categoria_id) values(2,'Lego LOTR', 970, '2021-09-22', 1);
INSERT IGNORE INTO VENDA(id, valor_total, `data`, cupom) values(1, 970, '2021-09-22', '');
INSERT IGNORE INTO VENDA(id, valor_total, `data`, cupom) values(2, 30, '2021-09-22', '');
INSERT IGNORE INTO ITEM_VENDA(id, venda_id, valor, valor_desconto, produto_id) values(1, 1, 970, 0, 1);
INSERT IGNORE INTO ITEM_VENDA(id, venda_id, valor, valor_desconto, produto_id) values(2, 2, 970, 0, 2);