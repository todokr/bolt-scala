import com.slack.api.app_backend.views.response.InputBlockResponse
import com.slack.api.bolt.App
import com.slack.api.bolt.handler.builtin.SlashCommandHandler
import com.slack.api.bolt.jetty.SlackAppServer

object Main {
  import Handlers._

  def main(args: Array[String]): Unit = {
    val app = new App()

    app.command("/hello", helloHandler)
    app.command("/echo", echoHandler)

    val server = new SlackAppServer(app);
    server.start()
  }
}

object Handlers {
  val helloHandler: SlashCommandHandler = (_, ctx) =>
    ctx.ack(":joy: It works! Yay!")

  val echoHandler: SlashCommandHandler = (req, ctx) => {
    val commandArgText = req.getPayload.getText
    val channelId = req.getPayload.getChannelId
    val channelName = req.getPayload.getChannelName
    val text = s"You said ${commandArgText} at <#${channelId}|${channelName}>"
    ctx.ack(text)
  }
}
