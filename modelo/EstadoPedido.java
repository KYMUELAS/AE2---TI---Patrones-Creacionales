package modelo;

// Esta clase enum representa los posibles estados de un pedido.
// Es como una lista de etiquetas que indican en qué etapa está el pedido.
public enum EstadoPedido {
    PENDIENTE,     // El pedido fue creado pero aún no se procesa
    EN_PROCESO,    // El pedido está siendo preparado
    ENTREGADO,     // El pedido ya fue entregado al cliente
    CANCELADO      // El pedido fue cancelado
}
