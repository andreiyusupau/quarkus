package io.quarkus.websockets.next.test.telemetry.endpoints.ontextmessage;

import io.quarkus.websockets.next.OnTextMessage;
import io.quarkus.websockets.next.WebSocket;
import io.smallrye.mutiny.Multi;

@WebSocket(path = "/received-single-dto-response-multi-dto")
public class SingleDtoReceived_MultiDtoResponse_Endpoint {

    @OnTextMessage
    public Multi<Dto> onMessage(Dto dto) {
        return Multi.createFrom().items("echo 0: " + dto.property(), "echo 1: " + dto.property()).map(Dto::new);
    }

}
