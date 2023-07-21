package kr.co.jhta.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/theater/list")
	public String theaterList() {
		return "board/boardview/list";
	}
}
