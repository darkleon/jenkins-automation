folder("GSSA") {
  configure { folder ->
    folder.remove(folder / healthMetrics)
  }
}

folder "GSSA/a"
folder "GSSA/a/b"