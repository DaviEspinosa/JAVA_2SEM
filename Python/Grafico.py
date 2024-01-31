import tkinter as tk
from tkinter import messagebox

class Elevador:
    def __init__(self, root):
        self.root = root
        self.root.title("Elevador")

        # Variáveis do elevador
        self.andar_atual = tk.IntVar(value=1)
        self.direcao = tk.StringVar(value="Parado")

        # Criação de widgets
        tk.Label(root, text="Andar Atual:").pack()
        tk.Entry(root, textvariable=self.andar_atual, state="readonly").pack()

        tk.Label(root, text="Direção:").pack()
        tk.Entry(root, textvariable=self.direcao, state="readonly").pack()

        tk.Button(root, text="Subir", command=self.subir).pack(side="left")
        tk.Button(root, text="Descer", command=self.descer).pack(side="right")

    def subir(self):
        if self.andar_atual.get() < 5:
            self.andar_atual.set(self.andar_atual.get() + 1)
            self.direcao.set("Subindo")
        else:
            messagebox.showinfo("Aviso", "O elevador já está no último andar.")

    def descer(self):
        if self.andar_atual.get() > 1:
            self.andar_atual.set(self.andar_atual.get() - 1)
            self.direcao.set("Descendo")
        else:
            messagebox.showinfo("Aviso", "O elevador já está no térreo.")

if __name__ == "__main__":
    root = tk.Tk()
    elevador = Elevador(root)
    root.mainloop()
