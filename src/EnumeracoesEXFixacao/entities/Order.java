package EnumeracoesEXFixacao.entities;

import EnumeracoesEXFixacao.entitiesENUM.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();


}
