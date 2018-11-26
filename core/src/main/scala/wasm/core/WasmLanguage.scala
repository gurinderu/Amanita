package wasm.core
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.TruffleLanguage.{ContextPolicy, Env}
import com.oracle.truffle.api.interop.TruffleObject
import wasm.core.runtime.WasmContext

@TruffleLanguage.Registration(id = WasmLanguage.id,
                              name = "wasm",
                              defaultMimeType = WasmLanguage.mime,
                              characterMimeTypes = Array(WasmLanguage.mime),
                              contextPolicy = ContextPolicy.SHARED)
final class WasmLanguage extends TruffleLanguage[WasmContext] {

  override def createContext(env: Env): WasmContext = new WasmContext()

  override def isObjectOfLanguage(obj: Any): Boolean = obj match {
    case v: TruffleObject => true
    case _                => false
  }
}

object WasmLanguage {
  val id = "wasm"
  val mime = "application/wasm"
}
