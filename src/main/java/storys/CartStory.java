package storys;

public class CartStory {

    // Epic
    public static final String EPIC_CART = "Cart";

    // User Stories
    public static final String USER_STORY_CART = "Como usuário do sistema, desejo gerenciar meu carrinho de compras " +
            "e concluir o processo de checkout com sucesso.";

    // Test Cases
    public static final String CT_CART_01 = "CE-01 Validar adição de item ao carrinho e conclusão do checkout com sucesso";
    public static final String CT_CART_02 = "CE-02 Validar adição de item ao carrinho e conclusão do checkout com pagamento via Check";
    public static final String CT_CART_03 = "CE-03 Validar processo de checkout com seleção de tamanho e cor";
    public static final String CT_CART_04 = "CE-04 Validar comportamento ao tentar continuar sem aceitar os termos de serviço";
    public static final String CT_CART_05 = "CE-05 Validar comportamento ao tentar finalizar compra com usuario sem endereço";
    public static final String CT_CART_06 = "CE-06 Validar comportamento ao tentar finalizar compra com usuario sem login";
    public static final String CT_CART_07 = "CE-07 Validar carrinho está vazio após o pagamento";
    public static final String CT_CART_08 = "CE-08 Validar Excluir produto do carrinho";
    public static final String CT_CART_09 = "CE-08 Validar Aumentar Quantidade de produto do carrinho";



    // Error Messages
    public static final String ERROR_TERMS_OF_SERVICE = "You must agree to the terms of service before continuing.";

    // Success Messages
    public static final String SUCCESS_ORDER_COMPLETE = "Your order on My Shop is complete.";
    public static final String SHOPPING_CART_EMPTY = "Your shopping cart is empty.";

}
