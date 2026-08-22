import UIKit
import WebKit

final class ViewController: UIViewController, WKNavigationDelegate {
    private var webView: WKWebView!
    override func loadView() {
        let cfg = WKWebViewConfiguration(); cfg.websiteDataStore = .default()
        webView = WKWebView(frame: .zero, configuration: cfg); webView.navigationDelegate = self; view = webView
    }
    override func viewDidLoad() {
        super.viewDidLoad(); view.backgroundColor = UIColor(red: 20/255, green: 16/255, blue: 13/255, alpha: 1)
        if let url = Bundle.main.url(forResource: "index", withExtension: "html") { webView.loadFileURL(url, allowingReadAccessTo: url.deletingLastPathComponent()) }
    }
    override var prefersStatusBarHidden: Bool { false }
    override var preferredStatusBarStyle: UIStatusBarStyle { .lightContent }
}
