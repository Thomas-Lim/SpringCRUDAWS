/**
 * 모든 응답 Dto가 추가되는 곳
 */

// 롬복 테스트용 프로그램

package springboot.web.dto;

import lombok.Getter;   // 선언된 모든 필드에 get 메소드를 생성
import lombok.RequiredArgsConstructor; // 선언된 모든 final 필드가 포함된 생성자를 생성. 파이널이 얿는 필드는 생성자에 포함되지 않음.

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}